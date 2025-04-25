import wollok.mirror.*
class Empresa {
    const property cuit 
    const property nombre 
    const empleados = #{}
    var property fechaAct = Date  
    const property recibos = [] 


    method totalPagoSueldo() {
      return empleados.sum({empleado => empleado.sueldoTotal()})
    }
    

    method totalRetenciones() {
      return empleados.sum({empleado => empleado.retencionesAplicadas()})
    }

    method liquidarSueldos() {
      empleados.forEach({empleado => self.generarReciboDe(empleado, fechaAct)})
    }

    method generarReciboDe(empleado, fecha) {
      var  recibo = new Recibo()
      recibo.generar(empleado, fecha)
      recibos.add(recibo)
      empleado.cobrar(recibo)
    }

    method agregarEmpleado(e) {
      empleados.add(e)
    }
}

class Recibo {
  var property nombre = null
  var property direccion = null
  var property fechaDeEmision = null
  var property sueldoBruto = null
  var property sueldoNeto = null
  var property desgloceDeConceptos = null

  method generar(empleado, fecha) {
    nombre = empleado.nombre()
    direccion = empleado.direccion()
    fechaDeEmision = fecha
    sueldoBruto = empleado.sueldoBruto()
    sueldoNeto = empleado.sueldoTotal()
    desgloceDeConceptos = "el empleado" empleado.nombre() "cuenta con sueldo bruto de " sueldoBruto "y retenciones aplicadas de" empleado.retencionesAplicadas() " "
  }
   
}

class Empleado {
  const  property nombre 
  const  property direccion
  const  property estadoCivil
  const  fechaDeNacimiento = Date
  const  property sueldoBasico
  var property anhoactual = 2025
  var property reciboDeSueldo = null 

  method edad() {
    return anhoactual - fechaDeNacimiento.year() 
  }

  method sueldoTotal() {
    return self.sueldoBruto() - self.retencionesAplicadas()
  }

  method cobrar(recibo) {
    reciboDeSueldo = recibo
  }

  method sueldoBruto() {
      return self.sueldoBasico()
  } 

  method descuentoDe_AlSueldoBruto(numero) {
    return (self.sueldoBruto() * numero) / 100 
  }
  method retencionesAplicadas()

}

class Permanente inherits Empleado {
  const  cantHijos
  const  antiguedad

  override method sueldoBruto(){
    return super() + self.salarioFamiliar()
  }

  override method retencionesAplicadas(){
    return self.descuentoDe_AlSueldoBruto(10) + self.retencionPorHijos() + self.descuentoDe_AlSueldoBruto(15)
  }

  method retencionPorHijos() {
    return 20 * cantHijos
  }

  method salarioFamiliar() {
    return self.asignacionPorHijos() + self.asignacionPorConyuge() +self.anhosDeAntiguedad()
  }

  method asignacionPorHijos() {
    return 150 * cantHijos
  }

  method asignacionPorConyuge() {
    if (estadoCivil.esCasado()){
      return 100
    }
    return 0
  }

  method anhosDeAntiguedad() {
    return 50 * antiguedad
  }
}

class Temporario inherits Empleado {
    const  property fechaDeDesignacion
    const  property cantHsExtras

  override method sueldoBruto(){
    return super() + self.sueldoHsExtras() 
  }

  method sueldoHsExtras() {
    return 40 * cantHsExtras
  }

  override method retencionesAplicadas(){
    return self.descuentoDe_AlSueldoBruto(10) + self.retencionEdad() + self.descuentoDe_AlSueldoBruto(10) + self.retencionHsExtras()
  }

  method retencionEdad() {
   return if (self.edad() >= 50){
       25
    }
  else
     0
  }

  method retencionHsExtras() {
    return 5 * cantHsExtras
  }
}

class Contratado inherits Empleado{
    const  numeroContrato
    const  medioDePago

    override method retencionesAplicadas() {
      return 50
    }

}

class EstadoCivil  {
  method esCasado() {
    return false
  }
}

class Soltero inherits EstadoCivil {
}

class Viudo inherits EstadoCivil {
}

class Casado inherits EstadoCivil {
  override method esCasado() {
    return true
  }
}



class Marca:
    def __init__(self, nombre):
        self.__nombre = nombre
    
    @property
    def nombre(self):
        return self.__nombre

    @nombre.setter
    def nombre(self, nombre):
        self.__nombre = nombre



class TV:
    numTV = 0
    def __init__(self, marca:Marca, estado:bool):
        self.__marca = marca
        self.__estado = estado
        self.__canal = 1
        self.__precio = 500
        self.__volumen = 1
        self.__control:Control = None
        TV.numTV += 1

    @property
    def marca(self):
        return self.__marca

    @marca.setter
    def marca(self, marca):
        self.__marca = marca

    @property
    def canal(self):
        return self.__canal

    @canal.setter
    def canal(self, canal):
        if self.estado == True and canal >=1 and canal <= 120:
            self.__canal = canal

    @property
    def precio(self):
        return self.__precio

    @precio.setter
    def precio(self, precio):
        self.__precio = precio

    @property
    def volumen(self):
        return self.__volumen
    

    @volumen.setter
    def volumen(self, volumen):
        if self.estado == True and 0 <= volumen <= 7:
            self.__volumen = volumen

    @property
    def control(self):
        return self.__control

    @control.setter
    def control(self, control):
        self.__control = control

    def turnOn(self):
        self.estado = True

    def turnOff(self):
        self.estado = False

    @property
    def estado(self):
        return self.__estado

    def canalUp(self):
        self.setCanal(self.canal + 1)

    def canalDown(self):
        self.setCanal(self.canal - 1)

    def volumenUp(self):
        self.setVolumen(self.volumen + 1)
    
    def volumenDown(self):
        self.setVolumen(self.volumen - 1)
class Control:
    def __init__(self, tv:TV):
        self.tv = tv

    def turnOn(self):
        self.tv.turnOn()
    
    def turnOff(self):
        self.tv.turnOff()

    def canalUp(self):
        self.tv.canalUp()

    def canalDown(self):
        self.tv.canalDown()

    def volumenUp(self):
        self.tv.volumenUp()
    
    def volumenDown(self):
        self.tv.volumenDown()

    def setCanal(self, numero_canal):
        self.tv.canal = numero_canal

    def setVolumen(self, numero_volumen):
        self.tv.volumen = numero_volumen
    
    def enlazar(self, tv):
        self.tv = tv
        tv.control = self
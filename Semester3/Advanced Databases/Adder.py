class Coffee:

    def __init__(self):
        espressoMeasurement = 1
        cream = 1

    def setEspresso(self,espresso):
        self.espresso = espresso

    def getEspresso(self):
        return self.espresso
    
    def setCream(self,cream):
        self.cream = cream

    def getCream(self):
        return self.cream
    
    def computeIngredients(self):
        print('Espresso ml: ', self.getEspresso())
        print('Cream/Coffee Ratio: ', self.getCream())
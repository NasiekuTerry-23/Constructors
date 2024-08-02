    class CoffeeMachine (_coffeeInMachine: Boolean, _coffee: String){

        var coffeeInMachine = _coffeeInMachine
        var coffee = _coffee

        fun coffeeFunction(){
            if (coffeeInMachine){
                println("You have $coffee beans in your coffee machine")
            }else{
                println("Your coffee machine needs some coffee to work correctly.")
            }
        }

    }

package Covarient;

class Animal{
    Animal getAnimal(){
        return new Animal();
    }
}
class Goat extends Animal{ 

      Goat getAniaml(){
        return new Goat();
        
      }
      void show(){ 
          System.out.println("Goat is Running");
      }
     
}
class Covarient {
    public static void main(String args[]){
          Goat g = new Goat();
         // g.getAniaml().show();
    }  
}


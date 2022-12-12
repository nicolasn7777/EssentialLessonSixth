package task_animals;

enum Animals {
    // Екземпляри
    CAT(5){
        @Override
        public String toString() {
            return "CAT " + age + " years old.";
        }
    },
    DOG(6){
        @Override
        public String toString() {
            return "DOG " + age + " years old.";
        }
    };
    int age;

    // Конструктор
    Animals(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Animals cat = Animals.CAT;
        System.out.println(cat.toString());

        Animals dog = Animals.DOG;
        System.out.println(dog.toString());
   }
}

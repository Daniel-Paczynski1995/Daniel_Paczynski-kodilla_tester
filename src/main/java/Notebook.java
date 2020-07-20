public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

        public void checkPrice() {
            if (this.price < 600) {
                System.out.println("This notebook is very cheap");
            } else if (this.price < 600 - 1000) {
                System.out.println("This price is good");
            }

            if (this.price > 600 - 1000) {
                System.out.println("This notebook is expensive");
            }
        }

        public void checkYear() {
            if ( this.year > 2018 && price < 600) {
                System.out.println("This is cool notebook");
            } else if (this.year < 2018 && price > 600) {
                System.out.println("This is not cool notebook");
            }

    }




        public void checkWeight() {
        if (this.weight < 500) {
            System.out.println("This notebook is light");
        }
            if (this.weight > 500-1500) {
                System.out.println("This notebook is heavy");
            }

    }


}
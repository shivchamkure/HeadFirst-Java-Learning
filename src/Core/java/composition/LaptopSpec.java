package Core.java.composition;

public class LaptopSpec {

        public static void main(String[] args) {
            Laptop lappy = new Laptop();
            System.out.println(lappy);
            System.out.print(lappy.getProcessor());
            System.out.println("\n" + lappy.getProcessor().getFrequency());

            Processor processor = new Processor("AMD Zen", "Zen 3600", 5, 6, 8, "30Mb",
                    "3.2Ghz", "2.4Ghz", "3.8Ghz");
            GraphicsCard graphicsCard = new GraphicsCard();

            Laptop notebook = new Laptop(15, processor, null, null, graphicsCard, null, null);
            System.out.println("\n"+ notebook);

        }
    }


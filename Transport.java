public class Transport {
    public interface MyTransport {
        void refuels();

        void move();

        void carry();
    }

    public abstract class GroundTransport implements MyTransport {
        @Override
        public void refuels() {//Релизация
        }

        @Override
        public void move() {//Релизация
        }

        @Override
        public void carry() {//Релизация
        }
    }
        public class Car extends GroundTransport {
            @Override
            public void move() {
                System.out.println("Едет быстро");
            }

            @Override
            public void refuels() {
                System.out.println("Бензин");
            }

            @Override
            public void carry() {
                System.out.println("2 тоннны");
            }
        }

        public class Bicycle extends GroundTransport {
            @Override
            public void move() {
                System.out.println("Едет и ладно");
            }

            @Override
            public void refuels() {
                System.out.println("Не нужно топливо");
            }

            @Override
            public void carry() {
                System.out.println("120 кг.");
            }
        }
        public class Motorcycle extends GroundTransport {
            @Override
            public void move() {
                System.out.println("Едет очень быстро");
            }

            @Override
            public void refuels() {
                System.out.println("Бензин");
            }

            @Override
            public void carry() {
                System.out.println("250 кг.");
            }
        }

    public abstract class AirTransport implements MyTransport {
        @Override
        public void refuels() {//Релизация
        }

        @Override
        public void move() {//Релизация
        }

        @Override
        public void carry() {//Релизация
        }
    }
        public class Plane extends AirTransport {
            @Override
            public void move() {
                System.out.println("Летит быстро и высоко");
            }

            @Override
            public void refuels() {
                System.out.println("Авиационный бензин");
            }

            @Override
            public void carry() {
                System.out.println("120 тонн");
            }
        }
        public class Aerostat extends AirTransport {
            @Override
            public void move() {
                System.out.println("Летит не высоко");
            }

            @Override
            public void refuels() {
                System.out.println("Газ");
            }

            @Override
            public void carry() {
                System.out.println("300 кг");
            }
        }
        public class Helicopter extends AirTransport {
            @Override
            public void move() {
                System.out.println("Летит не высоко, не низко");
            }

            @Override
            public void refuels() {
                System.out.println("Авиационный бензин");
            }

            @Override
            public void carry() {
                System.out.println("20 тонн");
            }
        }

    public abstract class WaterTransport implements MyTransport {
         @Override
         public void refuels() {//Релизация
         }

         @Override
         public void move() {//Релизация
         }

         @Override
         public void carry() {//Релизация
         }
    }
        public class Ship extends AirTransport {
            @Override
            public void move() {
                System.out.println("Идет по воде быстро");
            }

            @Override
            public void refuels() {
                System.out.println("Дизельное топливо");
            }

            @Override
            public void carry() {
                System.out.println("350 тонн");
            }
        }
        public class Powerboat extends AirTransport {
            @Override
            public void move() {
                System.out.println("Идет по воде медленно");
            }

            @Override
            public void refuels() {
                System.out.println("Бензин");
            }

            @Override
            public void carry() {
                System.out.println("220 кг");
            }
        }
        public class Tanker extends AirTransport {
            private TankerNum TankerFirst = new TankerNum("Синий", "УТ-523.02"), TankerSecond = new TankerNum("Бело-синий",
                    "УТ-523.02-01");
            private class TankerNum {
                private String color, model;
                private TankerNum(String color, String model){
                    this.color = color;
                    this.model = model;
                }
            }
            @Override
            public void move() {
                System.out.println("Идет по воде");
            }

            @Override
            public void refuels() {
                System.out.println("Дизельное топливо");
            }

            @Override
            public void carry() {
                System.out.println("80 тыс. тонн");
            }
        }

}




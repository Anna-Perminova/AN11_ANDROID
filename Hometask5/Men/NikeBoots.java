 class NikeBoots implements Boots{
        private String firm;

        public NikeBoots(String firm) {
            this.firm = firm;
        }

        public NikeBoots() {}

     @Override
     public void putOn() {
            System.out.println("Надевет кроссовки");

     }

     @Override
     public void takeOff() {
            System.out.println("Снимает кроссовки");

     }

     @Override
     public String getFirm() {
         return firm;
     }
 }

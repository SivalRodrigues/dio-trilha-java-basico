public class PlanoOperadora {
    public static void main(String[] args) {
        /* String plano = "M";

        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        }else if (plano == "M") {
            System.out.println("100 minuto de igação");
            System.out.println("Whats e Instagram grátis");
        }else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5Gb Youtube");
        }
      */
             String plano = "Y";
                 switch (plano) {
                case "T":{
                    System.out.println("5Gb Youtube");
                    break;
                }

                case "M":{
                    System.out.println("Whats e Instagram grátis");
                    break;
                }  
                
                case "B":{
                    System.out.println("100 minutos de ligação");
                    break;
                }
                    
             
                default:
                System.out.println("INDEFINIDO");
                    break;
             }
    }
}

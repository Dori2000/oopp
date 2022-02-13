public class Test {

    public static void main(String []args) {

        IdDoc id = new IdDoc("Dorian","Agalliu","2000-10-23", "Durres", "Mashkull","2016-07-26","2026-07-26",12);
        Contact con = new Contact("dori.agallu@icloud.com","+355096183754");

        //Education edu = new Education();


        //Address addd = new Address();


        //Experience exp = new Experience();


        System.out.println("Puntori 1: ");
        System.out.println(" ");
        System.out.println("--- TE DHENAT BIOMETRIKE ---");
        System.out.println("Emri: "+ id.getEmri());
        System.out.println("Mbiemri: "+id.getMbiemri());
        System.out.println("Datelindja:  "+id.getDtl());
        System.out.println("Vendlindja: "+id.getVendlindja());
        System.out.println("Gjinia: "+id.getGjinia());
        System.out.println("Data e Leshimit: "+id.getDataLeshimit());
        System.out.println("Daya e Skadimit "+id.getDataSkadimit());
        System.out.println(" ");

        System.out.println("--- KONTAKT(ET) ---");
        System.out.println("Emai: "+con.getEmail());
        System.out.println("Cel: "+ con.getCel());
        System.out.println(" ");

        System.out.println("--- ARSIMIMI ---");
        System.out.println(" ");

        System.out.println("--- EKSPERIENCA(T) ---");
        System.out.println(" ");

        System.out.println("--- ADRESA(T) ---");
        System.out.println(" ");





    }
}

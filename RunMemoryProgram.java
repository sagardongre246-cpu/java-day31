public class RunMemoryProgram {

    public static void main(String[] args) {

        String status = System.getProperty("already.ran");

        if (status == null) {
            System.setProperty("already.ran", "true");
            System.out.println("👋 First time execution detected!");
            System.out.println("Program has now remembered this run.");
        } else {
            System.out.println("🔁 I remember you. This program ran before!");
        }
    }
}
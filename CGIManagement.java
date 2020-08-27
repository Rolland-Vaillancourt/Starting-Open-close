public class CGIManagement {
    
    private String name;

    public CGIManagement(String name) {
        this.name = name;
        System.out.println(name + " is ready to manage !");
    }

    public void encourageEmployee(Employee employee) {
        if (employee instanceof Developer) {
            drinkCoffee();
            codeBugs();
            fixTheirBugs();
        } else if (employee instanceof QA) {
            test();
            blameTheDev();
        }
    }

    // Developers
    private void drinkCoffee() {
        System.out.println(" Developer is drinking coffee...");
    }

    private void codeBugs() {
        System.out.println(" Developer is adding bugs to the code...");
    }

    private void fixTheirBugs() {
        System.out.println(" Developer is fixing their bugs...");
    }

     // QA
    private void test() {
        System.out.println(" QA is testing...");
    }

    private void blameTheDev() {
        System.out.println(" QA is blaming the dev...");
    }
}
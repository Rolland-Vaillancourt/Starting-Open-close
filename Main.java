class Main { // Bureau de drummondville
    public static void main(String[] args) {
        
        CGIManagement dominic = new CGIManagement("Dominic Dufresne");

        Employee simon = new Developer("Simon Villiard");
        Employee samuel = new QA("Samuel Dongmo Tedontsa");

        dominic.encourageEmployee(simon);
        dominic.encourageEmployee(samuel);
    }
}
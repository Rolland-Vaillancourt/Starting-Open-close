class Main { // Bureau de drummondville
    public static void main(String[] args) {
        
        CGIManagement dominic = new CGIManagement();

        Employee simon = new Developer("Simon Villiard");
        dominic.whipEmployee(simon);

        Employee samuel = new QA("Samuel Dongmo Tedontsa");
        dominic.whipEmployee(samuel);
    }
}
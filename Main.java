class Main { // Bureau de drummondville
    public static void main(String[] args) {
        CGIManagement dominic = new CGIManagement();

        Employee simon = new Employee("Simon Villiard");
        dominic.whipEmployee(simon);

        Employee samuel = new Employee("Samuel Dongmo Tedontsa");
        dominic.whipEmployee(samuel);
  }
}
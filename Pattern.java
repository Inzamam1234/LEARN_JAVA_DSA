class Pattern {

    public void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
    public void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0;j <= i; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }

    public static void main (String[]args){

    Pattern sol = new Pattern();
    int n = 4;
    sol.pattern1(n);
    System.out.println();
    sol.pattern2(n);
    }

}
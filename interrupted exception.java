class imp{
    public static void main(String[] args)throws InterruptedException{
           String num="987654321";
            for(int i=1;i<=num.length();i++){
                System.out.println("\r"+num.substring(i-1,i));
                Thread.sleep(100);
            }
        }
    }

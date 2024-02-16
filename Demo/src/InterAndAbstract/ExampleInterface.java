package InterAndAbstract;
            interface addition{
                public int add(int a,int b);
                int x=10;
            }
            class a implements addition{
                @Override
                public int add(int a, int b) {
                    return a+b;
                    //System.out.println("Ayush");
                    //return 0;
                }
            }



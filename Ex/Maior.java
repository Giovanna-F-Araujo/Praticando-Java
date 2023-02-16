int numero = 0; 
    int maior = 0; 
    
    
    for(int i = 1; i <= 5; i++){
        System.out.print("n"+i+": ");  
        numero = sc.nextInt(); 
        
        if(numero >= count){
            count = numero;
           
        }
    }
   
    System.out.println("O maior numero e o "+ maior);
}
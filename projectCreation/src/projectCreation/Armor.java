package projectCreation;

    public static void main(String[] args){
        String myClass = "Rogue";
    	int myArmor = 0;
    	int armor;
    	int dex = 12;
            switch(myClass){
                  case "Rogue":
                    armor = padded(dex);

                  break;
                  default:
                     armor = 7;
            }
            //please do this for me call the number assign to bob
            //also call dex for me

        System.out.println("AC:  " + myArmor);
    }

  	 	public static int padded(int bob){
   			if (bob > 1){
   				myArmor = ((dex/2)-5.1) + 11;
   			} else {
   				myArmor = ((dex/2)-5.1) + 11 + 2; //shield
   			}
   			return myArmor;
   		}

    	public static int studdedLeather(int bob){
   			if (bob > 1){
   				myArmor = ((dex/2)-5.1) + 12;
   			} else {
   				myArmor = ((dex/2)-5.1) + 12 + 2; //shield
   			}
   			return myArmor;
   		}

 		public static int hide(int bob){
 			if (((dex/2)-5.1) > 2){
 				myDex = 2;
 			} else {
 				myDex = dex;
 			}

   			if (bob > 1){
   				myArmor = myDex + 12;
   			} else {
   				myArmor = myDex + 12 + 2; //shield
   			}
   			return myArmor;
   		}

   		public static int chainShirt(int bob){
 			if (((dex/2)-5.1) > 2){
 				myDex = 2;
 			} else {
 				myDex = dex;
 			}

   			if (bob > 1){
   				myArmor = myDex + 13;
   			} else {
   				myArmor = myDex + 13 + 2; //shield
   			}
   			return myArmor;
   		}

   		public static int scaleMail(int bob){
 			if (((dex/2)-5.1) > 2){
 				myDex = 2;
 			} else {
 				myDex = dex;
 			}

   			if (bob > 1){
   				myArmor = myDex + 14;
   			} else {
   				myArmor = myDex + 14 + 2; //shield
   			}
   			return myArmor;
   		}

   		public static int halfPlate(int bob){
 			if (((dex/2)-5.1) > 2){
 				myDex = 2;
 			} else {
 				myDex = dex;
 			}

   			if (bob > 1){
   				myArmor = myDex + 15;
   			} else {
   				myArmor = myDex + 15 + 2; //shield
   			}
   			return myArmor;
   		}

   		public static int ringMail(int bob){

   			if (bob > 1){
   				myArmor = 14;
   			} else {
   				myArmor = 16; //shield
   			}
   			return myArmor;
   		}

   		public static int chainMail(int bob){

   			if (bob > 1){
   				myArmor = 16;
   			} else {
   				myArmor = 18; //shield
   			}
   			return myArmor;
   		}

   		public static int splint(int bob){

   			if (bob > 1){
   				myArmor = 17;
   			} else {
   				myArmor = 19; //shield
   			}
   			return myArmor;
   		}

   		public static int plate(int bob){

   			if (bob > 1){
   				myArmor = 18;
   			} else {
   				myArmor = 20; //shield
   			}
   			return myArmor;
   		}

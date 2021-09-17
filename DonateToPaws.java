public class DonateToPaws{
   public static void main(String[] args){
    double donationAmount = IO.readDouble();
    double donationFee = 0;
    if (donationAmount < 150){
      IO.outputDoubleAnswer(donationFee);
    }
    if (donationAmount == 150){
      donationFee = 3;
      IO.outputDoubleAnswer(donationFee);
    }
    if (donationAmount > 150 & donationAmount <1500){
      double donationSet = donationAmount * 0.04;
      if (donationSet > 8){
        donationFee = donationFee + donationSet;
      }

      if (donationSet < 8) {
        donationFee = donationFee + 8;
      }
      IO.outputDoubleAnswer(donationFee);
    }
    if (donationAmount >= 1500 & donationAmount < 15000){
      double donationSet = donationAmount * 0.01;
      if (donationSet > 20){
        donationFee = donationFee + donationSet;
      }

      if (donationSet < 20) {
        donationFee = donationFee + 20;
      }
      IO.outputDoubleAnswer(donationFee);
    }

    if (donationAmount == 15000){
      donationFee = 150;
      IO.outputDoubleAnswer(donationFee);
    }

    if (donationAmount == 19000){
      donationFee = 150 + 80;
      IO.outputDoubleAnswer(donationFee);
    }

    if (donationAmount > 19000){
      donationFee = donationAmount * 0.02 + 150 + 80;
      IO.outputDoubleAnswer(donationFee);
    }


   }
}

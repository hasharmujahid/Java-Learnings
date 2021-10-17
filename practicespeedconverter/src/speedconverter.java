public class speedconverter {


        public static double tomilesperhour(double Kilometerperhour){
            if(Kilometerperhour < 0){
                return -1;

            }
            else{

                int milesperhour= (int) ((int)Kilometerperhour * 0.621);
                return milesperhour;

            }
        }


}

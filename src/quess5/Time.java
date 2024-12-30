package quess5;

public class Time {
        private int hour;
        private int minute;
        private int second;
        Time(){

        }
        public Time(int hour){
            this.hour = hour;
            this.minute = 00;
            this.second = 00;
        }
        public Time(int hour, int minute){
            this.hour = hour;
            this.minute = minute;
            this.second = 00;
        }
        public Time(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        public Time(Time other){
            this.hour = other.hour;
            this.minute = other.minute;
            this.second = other.second;
        }
        public void output(){
            System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
        }
}

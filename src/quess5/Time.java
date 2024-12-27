package quess5;

public class Time {
        private int hour;
        private int minute;
        private int second;
        Time(){

        }
        public Time(int hour){
            this.hour = hour;
            this.minute = 0;
            this.second = 0;
        }
        public Time(int hour, int minute){
            this.hour = hour;
            this.minute = minute;
            this.second = 0;
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
            System.out.println(hour + ":" + minute + ":" + second);
        }
}

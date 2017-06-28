int car_red = 13;
int car_yellow = 12;
int car_green = 11;
int button = 7;
int human_red = 5;
int human_green = 6;

void setup() {
  pinMode(car_red, OUTPUT);
  pinMode(car_yellow, OUTPUT);
  pinMode(car_green, OUTPUT);
  pinMode(button, INPUT_PULLUP);
  pinMode(human_red, OUTPUT);
  pinMode(human_green, OUTPUT);
}

void loop() {
  int sw = digitalRead(button);
  if(sw==1){
    digitalWrite(car_green,HIGH);
    digitalWrite(human_red,HIGH);
  }else{
    digitalWrite(car_green,LOW);
    digitalWrite(car_yellow,HIGH);
    delay(1000);
    digitalWrite(car_yellow,LOW);
    digitalWrite(car_red,HIGH);
    digitalWrite(human_red,LOW);
    digitalWrite(human_green,HIGH);
    delay(3000);
  for(int i=0;i<5;i++){
    digitalWrite(human_green,LOW);
    delay(1000);
    digitalWrite(human_green,HIGH);
    delay(1000);
  }
  digitalWrite(human_green,LOW);
  digitalWrite(car_red,LOW);
}
}

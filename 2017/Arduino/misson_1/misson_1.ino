void setup() {
  Serial.begin(9600);
  pinMode(7,INPUT_PULLUP);
  pinMode(13,OUTPUT);
  pinMode(12,OUTPUT);
  pinMode(11,OUTPUT);
  pinMode(10,OUTPUT);
  pinMode(9,OUTPUT);

}

void loop() {
 int sw = digitalRead(7);

 digitalWrite(11,1);
 digitalWrite(10,1);
Serial.println(sw);
 if(sw == 0)
 {
  digitalWrite(11,0);
 
 delay(1000);
 digitalWrite(12,1);
 delay(1000);
 digitalWrite(12,0);
 digitalWrite(13,1);
 digitalWrite(10,0);
 digitalWrite(9,1);
 delay(1000);
 digitalWrite(9,0);
 delay(1000);
 digitalWrite(9,1);
 delay(1000);
 digitalWrite(9,0);
 delay(1000);
 digitalWrite(9,1);
 delay(1000);
 digitalWrite(9,0);
 
 }

 digitalWrite(10,1);
 digitalWrite(13,0);
 digitalWrite(11,1);
 
 
}

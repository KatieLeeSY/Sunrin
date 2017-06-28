void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(13,INPUT_PULLUP);
}

void loop() {
  // put your main code here, to run repeatedly:
  int sw = digitalRead(13);
  Serial.println(sw);
  delay(300);
}

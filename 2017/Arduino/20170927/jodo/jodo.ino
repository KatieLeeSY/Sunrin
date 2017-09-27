int LED = 9;

void setup() {
  pinMode(9, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  int cds = analogRead(0);
  Serial.println(cds);
  if(cds<140){
    digitalWrite(LED, HIGH);
  } else {
    digitalWrite(LED, LOW);
  }
  delay(100);
}

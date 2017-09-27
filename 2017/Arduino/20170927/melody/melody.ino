int melody[] = {262, 294, 330, 349, 392, 440, 494, 523};

void setup() {
}

void loop() {
 int i;
 for(i=0; i<=7; i++) {
  tone(8, melody[i], 250);
  delay(400);
  noTone(8);
 }

 int j;
 for(j=0;  j<256; j++) {
  analogWrite(9, j);
  delay(10);
 }
 for(j=255; j>=0; j--) {
  analogWrite(9, j);
  delay(10);
 }
}

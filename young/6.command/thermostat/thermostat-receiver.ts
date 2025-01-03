
  // Receiver: 스마트 온도 조절기
  export class Thermostat {
    private temperature: number = 20; // 기본 온도: 20도
  
    setTemperature(temp: number): void {
      console.log(`Setting temperature to ${temp}°C`);
      this.temperature = temp;
    }
  
    resetTemperature(): void {
      console.log("Resetting temperature to default (20°C)");
      this.temperature = 20;
    }
  }
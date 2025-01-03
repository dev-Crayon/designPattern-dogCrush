import { RemoteControl } from "./invoker/remote-controller";
import { LightOffCommand, LightOnCommand } from "./light/light-command";
import { SmartLight } from "./light/light-receiver";
import { SetTemperatureCommand } from "./thermostat/thermostat-command";
import { Thermostat } from "./thermostat/thermostat-receiver";

// Command 인터페이스
export interface Command {
    execute(): void;
    undo(): void;
  }
 
  // 클라이언트 코드
  const light = new SmartLight();
  const thermostat = new Thermostat();
  const remote = new RemoteControl();
  
  // 조명 켜기/끄기
  const lightOn = new LightOnCommand(light);
  const lightOff = new LightOffCommand(light);
  
  // 온도 설정
  const setTemperature = new SetTemperatureCommand(thermostat, 25);
  
  // 리모컨으로 명령 실행
  remote.executeCommand(lightOn); // "The light is ON"
  remote.executeCommand(setTemperature); // "Setting temperature to 25°C"
  remote.executeCommand(lightOff); // "The light is OFF"
  
  // 실행 취소
  remote.undoLastCommand(); // "The light is ON"
  remote.undoLastCommand(); // "Resetting temperature to default (20°C)"
  remote.undoLastCommand(); // "The light is OFF"
  
import { Engine } from '../interfaces/engine.interface';

export class TruckEngine implements Engine {
  start() {
    console.log('트럭 엔진을 시작합니다.');
  }
}

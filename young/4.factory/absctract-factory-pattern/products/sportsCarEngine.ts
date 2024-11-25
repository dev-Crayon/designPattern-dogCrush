import { Engine } from '../interfaces/engine.interface';

export class SportsCarEngine implements Engine {
  start() {
    console.log('스포츠카 엔진을 시작합니다.');
  }
}

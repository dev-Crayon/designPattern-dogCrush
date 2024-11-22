import { Tire } from '../interfaces/tire.interface';

export class TruckTire implements Tire {
  inflate() {
    console.log('트럭 타이어를 팽창시킵니다.');
  }
}

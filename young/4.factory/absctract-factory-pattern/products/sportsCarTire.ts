import { Tire } from '../interfaces/tire.interface';

export class SportsCarTire implements Tire {
  inflate() {
    console.log('스포츠카 타이어를 팽창시킵니다.');
  }
}

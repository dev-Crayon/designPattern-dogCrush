import { Car } from './Car/car';
import { Cedan, Coupe } from './Model/models';
import {
  AutoPilot,
  DRS,
  HotButt,
  PremiumSpeaker,
  SunRoof,
} from './Options/options';

// 깡통 세단
let firstCar: Car = new Cedan();
firstCar.getDescriptions();

// DRS 옵션 추가
firstCar = new DRS(firstCar);
firstCar.getDescriptions();

// 스피커 옵션 추가
firstCar = new PremiumSpeaker(firstCar);
firstCar.getDescriptions();

// 깡통 쿠페에 여러 옵션 추가
let secondCar: Car = new Coupe();
secondCar = new HotButt(new AutoPilot(secondCar));
secondCar.getDescriptions();
secondCar = new DRS(new SunRoof(secondCar));
secondCar.getDescriptions();

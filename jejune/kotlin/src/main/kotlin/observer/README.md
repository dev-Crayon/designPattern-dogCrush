### 옵저버 패턴

옵저버 패턴은 객체의 상태 변화를 관찰하는 관찰자 목록을 객체에 등록하여 상태 변화가 있을 때마다 메서드를 호출하는 디자인 패턴이다.

### 구현
CarStateSubject.Kt는 옵저버 패턴을 구현한 코드이다. CarStateSubject는 CarStateObserver를 등록하고 제거하는 메서드를 가지고 있다. CarStateObserver는 상태 변화가 있을 때 호출되는 메서드를 가지고 있다.
이때 옵저버에게 노티가 갈때 모든 옵저버에게 가는 것이 아니라 상태에 맞는 옵저버에게만 가도록 구현하였다.

```kotlin
// 인터페이스
interface CarStateObserver {
    val monitoringStateType: CarStateType  // 모니터링하는 상태 유형
    fun update(carState: CarState)
}

// 상태에 맞는 옵저버 관리
override fun notifyObservers(stateType: CarStateType) {
        observers.filter { it.monitoringStateType == stateType }
            .forEach { it.update(currentState) }
    }
```

### 사용
1. CarStateSubject를 구현한 Car 클래스를 생성한다.
2. 각각의 구현체들의 모니터 즉, 옵저버들을 등록해준다.
3. 그리고 상태 변화가 있을 때 해당 옵저버들의 메서드를 호출한다. (노티)
4. 옵저버들은 노티를 받아서 처리한다. 이때 각 상태에 맞는 옵저버를 호출한다.

### 배움 및 구현 후 느낀점
1. 조금 더 옵저버스럽게 처음 생성 시점에 어떤 것들을 구독할지 알고 있다면 좋지 않을까?
   - 생성 시점에 확장함수 혹은 구독에 대한 것을 처리하는 함수를 만들 수 있을 것 같다.
2. 굳이 get 해오는 옵저버가 mutableList여야 할까?
   - 그럴 필요가 없고 이걸 상용에서 쓰려면 더 많은 고민이 필요할 것 같다. 내 생각에는 immutableList로 하는 것이 더 좋을 것 같다.
3. 풀, 푸쉬 방식에 대한 고민
   - 각각 장단점이 있는 것 같다. 풀은 상태만 알리고, 옵저버가 데이터를 가져감. 푸쉬는 일단 다 전달하고 처리.
4. 과연 느슨한 결합일까?
   - 서브젝트와 옵저버 사이의 관계를 느슨하게 만들지만, 결국 서브젝트는 옵저버를 알고 있어야 하고, 옵저버는 서브젝트를 알고 있어야 한다.
   - 사실 생각하는 관점에 따라 다른 것 같다. 구체적인 의존성은 감소하고, 동적으로 관리할 수 있고, 변경 및 추가에 용이하다는 장점이 확실하기 때문이다.
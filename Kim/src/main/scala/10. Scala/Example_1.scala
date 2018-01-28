import sun.text.normalizer.RangeValueIterator.Element

/**
  * Created by donghwankim on 2017. 10. 24..
  */

/* elem이라는 팩토리 메소드 생성 및 작성한 팩토리 메소드 elem은
   전달받은 데이터를 가지고 새로운 요소를 생성
   elem(s: String) Element

   요소를 Element 타입으로 모델링한다.
   어떤 요소에 대해 above나 beside 메소드를 호출할수 있다.
   이때 요소를 인자로 전달하면 두 요소를 결합한 새로운 요소가 생성된다

   val column1 = elem("hello") above elem("***")
   val volumn2 = elem("***") above elem("world")
   column1 beside column2

   /* result
   hello ***
   *** world
   */

   특정 도메인 요소를 결합해 새로운 요소를 만들어 내는것을 콤비네이터라고 부른다.
   콤비네이터의 관점에서 생각하는 것은 일반적으로 라이브러리 설계시 좋은 접근 방법이다.
 */






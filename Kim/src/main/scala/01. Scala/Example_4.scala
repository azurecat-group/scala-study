/**
  * Created by donghwankim on 2017. 6. 19..
  */
/* Java 코드
boolean nameHasUpperCase = false;
for (int i = 0; i < name.length(); i++ {
  if (Character.isUpperCase(name.CharAt(i)))) {
    nameHasUpperCase = true;
    break;
    }
}
*/

/* Scala 코드
val nameHasUpperCase = name.exists(_.isUpper)
*/

/* Java 코드
interface CharacterProperty {
  boolean hasProperty(char ch);
}
*/

/* Java 코드
exists(name, new CharacterProperty() {
  public boolean hasProperty(char ch) {
    return Character.isUpperCase(ch);
    }
});
 */
# Semantics Implementations
Simple implementations built in Scala.

## Supo1
## Issues
Still has issue with return statements (they don't actually return, but they do unroll the state). This means that this will crash the interpreter as the second return has nowhere to return to.
```javascript
function test(){
    return 1;
    return 2;
}
```
var multipleof3and5 = function(maxLimit) {
  
  var sum = 0;
  for (var i = 0; i < maxLimit; i++) {
    if (i % 3 === 0 || i % 5 === 0) {
      sum += i;
    }
  }

};

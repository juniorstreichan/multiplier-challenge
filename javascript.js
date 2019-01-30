function multiply(n1 = 0, n2 = 0) {
  let total = 0;
  const negativo = n1 < 0;
  if (negativo) n1 = -n1;

  for (let i = 0; i < n1; i++) {
    total += n2;
  }
  const result = negativo ? -total : total;
  console.log("result is :"result);
  return result;
}

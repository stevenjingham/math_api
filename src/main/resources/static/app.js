async function checkPrime() {
  const number = document.getElementById("numberInput").value;
  const resultElement = document.getElementById("resultCheckPrime");

  try {
    const response = await fetch(`http://localhost:8080/primeNumber/${number}`);
    if (!response.ok) throw new Error("API error");
    const data = await response.json();
            console.log(data);
    resultElement.textContent = `${data.number} is prime: ${data.prime}`;
  } catch (err) {
    resultElement.textContent = `Error: ${err.message}`;
  }
}



async function getPrimesBelowInputNumber() {
  const number = document.getElementById("numberInput").value;
  const resultElement = document.getElementById("resultGetPrimesBelow");

  try {
    const response = await fetch(`http://localhost:8080/getPrimesBelowInputNumber/${number}`);

    if (!response.ok) throw new Error("API error");
    const data = await response.json();
        console.log(data);
    resultElement.textContent = `Primes below ${data.number} are: ${data.primes}`;
  } catch (err) {
    resultElement.textContent = `Error: ${err.message}`;
  }
}

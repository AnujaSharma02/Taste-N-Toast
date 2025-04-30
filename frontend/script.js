document.getElementById('orderForm').addEventListener('submit', async function (e) {
  e.preventDefault();
  const foodItem = document.getElementById('foodItem').value;
  const quantity = document.getElementById('quantity').value;

  const res = await fetch('http://localhost:8080/api/order', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({ foodItem, quantity })
  });

  const data = await res.json();
  document.getElementById('message').innerText = data.message;
});

<script>
	let name = "vijaya"
	let price = `<a href="#" onclick="alert('you are hacked !')">win price </a>`
</script>

<main>
	<h1>hello {name}</h1>
	<h1>{@html price}</h1>
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>
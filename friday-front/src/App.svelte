<script>
    import { hihi, lol } from "./mdr";

    let section;
    lol.toString();
</script>

<style lang="postcss">
    main {
        @apply grid place-items-center h-full;
    }

    h1 {
        @apply first-line:uppercase;
    }
</style>

<main>
    <div>
        <section bind:this={section}>
            <h1 class="first-letter:text-yellow-500 text-svelte-500 text-4xl pb-8">Svelte & TailwindCSS JIT on Vite</h1>
        </section>
        {lol}
        {hihi.sasageo}
        <pre>
          {section?.innerHTML}
        </pre>
    </div>
</main>

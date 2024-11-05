import Bun from "bun";

async function main() {
    await Bun.build({
        entrypoints: ["./src/index.jsx"],
        outdir: "out"
    })
}

main().then(()=>{
    console.log("done")
}).catch(()=>{
    console.log("error")
});
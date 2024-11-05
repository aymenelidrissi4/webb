import Bun from "bun";

async function main() {
    await Bun.build({
        entrypoints: ["./src/index.jsx"],
        outdir: "../src/main/webapp/WEB-INF/resources/js"
    })
}

main().then(()=>{
    console.log("done")
}).catch(()=>{
    console.log("error")
});
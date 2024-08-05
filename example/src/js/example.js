import { CubixRootPlugin } from 'cubixroot-custom-plugin';

window.testEcho = () => {
    const inputValue = document.getElementById("echoInput").value;
    CubixRootPlugin.echo({ value: inputValue })
}

import * as THREE from 'three';
// Imported three.js
const scene = new THREE.Scene();
// Set up a scene using the three.js constructor.
const camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);
// Set up a camera using the three.js constructor.
const renderer = new THREE.WebGLRenderer();
// Set up a renderer using the three.js constuctor.
renderer.setSize(window.innerWidth, window.innerHeight);
// Set the size of the renderer based on the dimensions of the camera.
document.body.appendChild(renderer.domElement);

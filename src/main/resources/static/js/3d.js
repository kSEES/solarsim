import * as THREE from 'three';

/*
    Creation of camera and scenes to prepare OpenGL for programming.
    Created a new camera with a perspective in the middle of a window.
 */
const scene = new THREE.Scene();
const camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);
const renderer = new THREE.WebGLRenderer();

renderer.setSize(window.innerWidth, window.innerHeight);
document.body.appendChild(renderer.domElement);

const geometry = new THREE.SphereGeometry(15, 32, 16);
const material = new THREE.MeshBasicMaterial( { color: 0x0096FF } );
const sphere = new THREE.Mesh( geometry, material ); sphere.add(scene);
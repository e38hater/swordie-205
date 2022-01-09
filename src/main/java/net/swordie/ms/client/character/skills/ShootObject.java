package net.swordie.ms.client.character.skills;

import net.swordie.ms.client.character.Char;
import net.swordie.ms.connection.InPacket;
import net.swordie.ms.connection.OutPacket;
import net.swordie.ms.util.Position;

    public class ShootObject {
        private Char owner;
        private int skillId, slv, id;
        private short direction;
        private Position position;
        private int delay;
        private boolean flip;
        private boolean isCrystal;
        private Position crystalPosition;

        public ShootObject(Char owner, int skillId, int slv, int id, short direction, Position position, int delay, boolean flip, boolean isCrystal, Position crystalPosition) {
            this.owner = owner;
            this.skillId = skillId;
            this.slv = slv;
            this.id = id;
            this.direction = direction;
            this.position = position;
            this.delay = delay;
            this.flip = flip;
            this.isCrystal = isCrystal;
            this.crystalPosition = crystalPosition;
        }

        public ShootObject(Char owner, InPacket inPacket) {
            this.owner = owner;
            this.skillId = inPacket.decodeInt();
            this.slv = inPacket.decodeInt();
            this.id = inPacket.decodeInt();
            this.direction = inPacket.decodeShort();
            this.position = inPacket.decodePosition();
            this.delay = inPacket.decodeInt();
            this.flip = inPacket.decodeByte() != 0;
            this.isCrystal = inPacket.decodeByte() != 0;
            if (isCrystal()) {
                this.crystalPosition = inPacket.decodePositionInt();
            }
        }

        public void encodeShootObjectRemote(OutPacket outPacket) {
            outPacket.encodeInt(getSkillId()); // skill id
            outPacket.encodeInt(getSlv()); // slv
            outPacket.encodeInt(getId()); // object Id
            outPacket.encodeShort(getDirection()); // direction
            outPacket.encodePosition(getPosition()); // start position
            outPacket.encodeInt(getDelay()); // delay
            outPacket.encodeByte(isFlip()); // flip
            outPacket.encodeByte(isCrystal()); // crystal
            if (isCrystal()) {
                outPacket.encodePositionInt(getCrystalPosition());
            }
        }

        public Char getOwner() {
            return owner;
        }

        public void setOwner(Char owner) {
            this.owner = owner;
        }

        public int getSkillId() {
            return skillId;
        }

        public void setSkillId(int skillId) {
            this.skillId = skillId;
        }

        public int getSlv() {
            return slv;
        }

        public void setSlv(int slv) {
            this.slv = slv;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public short getDirection() {
            return direction;
        }

        public void setDirection(short direction) {
            this.direction = direction;
        }

        public Position getPosition() {
            return position;
        }

        public void setPosition(Position position) {
            this.position = position;
        }

        public int getDelay() {
            return delay;
        }

        public void setDelay(int delay) {
            this.delay = delay;
        }

        public boolean isFlip() {
            return flip;
        }

        public void setFlip(boolean flip) {
            this.flip = flip;
        }

        public boolean isCrystal() {
            return isCrystal;
        }

        public void setCrystal(boolean crystal) {
            isCrystal = crystal;
        }

        public Position getCrystalPosition() {
            return crystalPosition;
        }

        public void setCrystalPosition(Position crystalPosition) {
            this.crystalPosition = crystalPosition;
        }
    }
